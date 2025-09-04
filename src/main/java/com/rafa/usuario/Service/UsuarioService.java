package com.rafa.usuario.Service;

import com.rafa.usuario.Entidade.Usuario;
import com.rafa.usuario.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){

        this.repository = repository;
    }

    public List<Usuario>listarTodos(){
        return repository.findAll();
    }

   public Usuario salvar(Usuario usuario){
        return repository.save(usuario);

   }
 public Usuario buscarPorId (Long id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Usuario nao Encontrado"));
 }
 public void deletar(Long id){
        repository.deleteById(id);
 }
}
