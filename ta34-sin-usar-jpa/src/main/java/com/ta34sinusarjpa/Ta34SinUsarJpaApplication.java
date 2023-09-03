package com.ta34sinusarjpa;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@SpringBootApplication
@RestController
public class Ta34SinUsarJpaApplication {

    private ArrayList<empleados> empleados = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Ta34SinUsarJpaApplication.class, args);
    }

    @GetMapping("/empleados")
    public String getAll() {
        Gson gson = new Gson();
        String json = gson.toJson(empleados);

        return json;
    }

    @PostMapping("/createEmpleado")
    public void create(@RequestBody String empleadoJson) {
        Gson gson = new Gson();
        empleados empleado = gson.fromJson(empleadoJson, empleados.class);

        // Calcular salario según el trabajo
        switch (empleado.getTrabajo()) {
            case Programador:
                empleado.setSalario(1400);
                break;

            case Professor:
                empleado.setSalario(2000);
                break;

            case Medico:
                empleado.setSalario(2100);
                break;

            case Bombero:
                empleado.setSalario(1500);
                break;

            case Policia:
                empleado.setSalario(1600);
                break;

            default:
                empleado.setSalario(800);
                break;
        }
        empleados.add(empleado);
    }

    @PutMapping("/empleado/{id}")
    public void update(@PathVariable int id, @RequestBody String empleadoJson) {
        Gson gson = new Gson();
        empleados empleadoUpdated = gson.fromJson(empleadoJson, empleados.class);

        for (empleados empleado : empleados) {
            if (empleado.getId() == id) {
                empleado.setNombre(empleadoUpdated.getNombre());
                empleado.setTrabajo(empleadoUpdated.getTrabajo());

                // Calcular salario según el trabajo
                switch (empleado.getTrabajo()) {
                    case Programador:
                        empleado.setSalario(1400);
                        break;

                    case Professor:
                        empleado.setSalario(2000);
                        break;

                    case Medico:
                        empleado.setSalario(2100);
                        break;

                    case Bombero:
                        empleado.setSalario(1500);
                        break;

                    case Policia:
                        empleado.setSalario(1600);
                        break;

                    default:
                        empleado.setSalario(800);
                        break;
                }
            }
        }
    }

    @DeleteMapping("/empleado/{id}")
    public void delete(@PathVariable int id) {
        empleados.removeIf(empleado -> empleado.getId() == id);
    }
}
