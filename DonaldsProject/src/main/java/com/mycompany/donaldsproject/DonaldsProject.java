package com.mycompany.donaldsproject;

import com.mycompany.donaldsproject.persistencia.JPAUtil;
import com.mycompany.donaldsproject.persistencia.Pedido;
import com.mycompany.donaldsproject.persistencia.PedidoJPA;
import com.mycompany.donaldsproject.telas.TelaInicial;
import java.util.List;


public class DonaldsProject {

    public static void main(String[] args) {
        
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        //Dando as informações do pedido para o ojeto Pedido
        /*Pedido pedido = new Pedido();
        pedido.setFood("Food");
        pedido.setCliente("Cliente");
        pedido.setHorario("Horário");
        pedido.setEndereco("Endereço");
        //Cadastrando o pedido por meio do método cadastrar
        PedidoJPA.cadastrar(pedido);
        
        
        //Listando o pedido
        List<Pedido> lista = PedidoJPA.listar();
        for (int i=0; lista.size()>i; i++){
           // Podcast p = new Podcast();
          //int podcastId = p.getId();  ✅ Correto!

            System.out.println(lista.get(i).getId() + "-" + lista.get(i).getFood());
        
        
        Teste conexão
        JPAUtil.conectar();
        JPAUtil.desconectar();*/
    }
   }
