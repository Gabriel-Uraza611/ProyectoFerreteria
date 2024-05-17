package gui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JLabel;

public class Product {
    //matriz inventario: nom, desc, prec, stock, material, uso, herrameintas
    public String name;
    public String descript;
    public String price;
    public String amount;
    public String material;
    public String use;
    public String tools;
    public static List<Product> products = Arrays.asList(new Product("MARTILLO", "MARTILLO DE MANO LIGERO (500g) RESISTENTE DISPONIBLE EN NEGRO CAFE Y METALIZADO", "50000", "600", "HIERRO-ACERO-MADERA", "GOLPEAR COSAS - CLAVAR O SACAR CLAVOS", "CLAVOS O PUNTILLAS-RECOMENDADO GUANTES DE PROTECCIÓN"),
                                                         new Product("SIERRA DE MANO", "SIERRA PARA CORTAR MADERA O ALGUNOS METALES HOJA DENTADA DE ACERO DURADERA AFILABLE", "50000", "400", "ACERO-ROBLE-POLIURETANO", "CORTES RECTOS !RECTOS! EN MADERA-PLASTICO O METAL(LIMITADO) CARPINTERÍA MARQUETERÍA REPARACIÓNES", "RECOMENDADO PRENSA PARA FIJAR OBJETOS A CORTAR"),
                                                         new Product("PISTOLA DE CLAVOS", "MAQUINA DE MANO PARA CLAVAR PUNTILLA METALICA CAPACIDAD 80 INCLUYE DOS BATERIAS INTERCAMBIABLES", "450000", "150", "ALUMINIO-ACERO-POLICARBONATO-PCB-CIRCUITO ELECTRÓNICO", "INSTALACIÓN DE PANELES DE MADERA O LAMINAS METALICAS-ENSAMBLAJE DE MUEBLES-CARPINTERIA-INSTALACIÓN DE TECHOS", "CLAVOS DE ACERO 2.5CM")
                                                        );
    //matriz inventario: nom, desc, prec, stock, material, uso, herrameintas

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescript() {
        return descript;
    }
    public void setDescript(String descript) {
        this.descript = descript;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getUse() {
        return use;
    }
    public void setUse(String use) {
        this.use = use;
    }
    public String getTools() {
        return tools;
    }
    public void setTools(String tools) {
        this.tools = tools;
    }
    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(String name, String descript, String price, String amount, String material, String use, String tools){
        products.add(new Product(name, descript, price, amount, material, use, tools));
    }

    public Product(String name, String descript, String price, String amount, String material, String use, String tools) {
        this.name = name;
        this.descript = descript;
        this.price = price;
        this.amount = amount;
        this.material = material;
        this.use = use;
        this.tools = tools;
    }
}
