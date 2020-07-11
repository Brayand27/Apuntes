package com.apuntes.modelo.dao;

import com.apuntes.config.Conexion;

public class ApunteDAO {

    Conexion cnn = new Conexion();

    public int InsertarApunte() {
        String sentencia = "Insert into Apuntes values (?,?,?,?)";
//        while (Map row : results) {
//            CursoVO curso = new CursoVO();
//            NivelVO nivel = new NivelVO();
//
//            curso.setId((int) row.get("id"));
//            curso.setNombre((String) row.get("nombre"));
//            nivel.setId((int) row.get("nivel_id"));
//            nivel.setNombre((String) row.get("nivel_nombre"));
//            curso.setNivel(nivel);
//            cursos.add(curso);
//        }
//
//        return cursos;
        return 0;
    }

}
