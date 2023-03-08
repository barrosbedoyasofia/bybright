package com.example.bybright.servicios;

import java.util.List;

public interface ServicioComun<E>{
    public List<E> buscarTodos() throws Exception;
    public E buscarPorId(Integer id) throws Exception;
    public E agregar(E datos) throws Exception;

}
