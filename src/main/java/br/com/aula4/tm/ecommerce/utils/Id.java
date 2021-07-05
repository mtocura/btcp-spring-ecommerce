package br.com.aula4.tm.ecommerce.utils;

public class Id {
    public static long idCliente = 1l;
    public static long idPedido = 1l;
    public static long idProduto = 1l;

    public static long generateIdCliente() {
        return idCliente++;
    }

    public static long generateIdPedido() {
        return idPedido++;
    }

    public static long generateIdProduto() {
        return idProduto++;
    }
}
