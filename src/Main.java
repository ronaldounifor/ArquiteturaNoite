package Arquitetura.src;

import Arquitetura.src.desenho.Circulo;
import Arquitetura.src.desenho.FormaGeometrica;
import Arquitetura.src.desenho.Renderizador;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.getRaio();

        Renderizador renderizador = new Renderizador();
        renderizador.desenhar(circulo);
    }
}
