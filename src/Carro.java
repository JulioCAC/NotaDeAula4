public class Carro {
    String marca, modelo;
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void mostraDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}