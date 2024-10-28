package com.boleta.boleta.controller;


import com.boleta.boleta.models.Boleta;
import com.boleta.boleta.repository.IRepositorioBoleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleta")
public class BoletaController {

    @Autowired
    private IRepositorioBoleta repositorioBoleta;

    @GetMapping("/listar")
    public List<Boleta> listarBoleta(){
        List<Boleta> listado = repositorioBoleta.findAll();
        return listado;
    }
    @PostMapping("/guardar")
    public String guardarBoleta(@RequestBody Boleta boleta){
        repositorioBoleta.save(boleta);
        return "Guardado Con Exito";
    }
    @DeleteMapping("/Eliminar")
    public void eliminarBoleta(@PathVariable Long id){
        repositorioBoleta.deleteById(id);
    }

    @PutMapping("/actualizar")
    public void actualizarBoleta(@RequestBody Boleta boleta){
        repositorioBoleta.save(boleta);
    }



}
