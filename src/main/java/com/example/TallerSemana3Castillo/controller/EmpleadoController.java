/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TallerSemana3Castillo.controller;

import com.example.TallerSemana3Castillo.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author casti
 */
@Controller
public class EmpleadoController {

    // Muestra el formulario de empleado
    @GetMapping("/formulario_empleado")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado()); // Objeto vacío para el formulario
        return "formulario_empleado"; // Devuelve la vista del formulario
    }

    // Procesa el formulario y muestra el resultado
    @PostMapping("/guardar_empleado")
    public String guardarFormulario(Empleado empleado, Model model) {
        model.addAttribute("empleado", empleado); // Agrega el objeto al modelo
        return "resultado_empleado"; // Redirige a la vista resultado
    }
}