package com.mycompany.donaldsproject.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class PedidoJPA {
     
     public static boolean cadastrar(Pedido pedido){
         EntityManager manager = JPAUtil.conectar();
         boolean sucesso = false;//ainda não se teve sucesso
         
         try{
             manager.getTransaction().begin();
             manager.persist(pedido);
             manager.getTransaction().commit();
             sucesso = true;
         }catch(Exception e){
            manager.getTransaction().rollback();
            System.err.println("Erro ao cadastrar podcast: " + e.getMessage()); // Imprime erro no console
            e.printStackTrace(); // Exibe mais detalhes do erro
         }finally{
             JPAUtil.desconectar();
         }
         return sucesso;
     }
     
      public static List<Pedido> listar() {
        List<Pedido> lista = new ArrayList<Pedido>();
        
        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT p FROM Pedido p");
            lista = consulta.getResultList();
        } catch(Exception e) {
            e.printStackTrace(); // Melhor para debug
        } finally {
            JPAUtil.desconectar();
        } 
        return lista;
      }
    
}
