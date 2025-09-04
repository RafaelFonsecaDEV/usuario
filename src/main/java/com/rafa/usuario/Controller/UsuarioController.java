package com.rafa.usuario.Controller;


import com.rafa.usuario.Entidade.Usuario;
import com.rafa.usuario.Service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios") //rota principal
public class UsuarioController {

private final UsuarioService service;

public UsuarioController(UsuarioService service){
    this.service = service;
}
// lista todos
@GetMapping
    public List<Usuario> listar(){
    return service.listarTodos();
}
//busca por id
@PostMapping
   public Usuario criar(@RequestBody Usuario usuario){
    return service.salvar(usuario);
   }
  @GetMapping("/{id}")
  public Usuario buscar(@PathVariable Long id){
     return service.buscarPorId(id);

  }
  // usuario
  @DeleteMapping("/{id}")
   public void deletar(@PathVariable Long id){
    service.deletar(id);
  }


}
