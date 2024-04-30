package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class cProducto {
    
   //ATRIBUTOS
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_producto")
   private int id;
   
   @Column(name = "descripcion", length = 50)
   private String descripcion;

   @Column(name = "unid_medida", length = 10)
   private String unid_medida;

   @Column(name = "costo", columnDefinition = "decimal(18,2)")
   private double costo;

   @Column(name= "precio", columnDefinition = "decimal(18,2)")
   private double precio;

   @Column(name= "stock", columnDefinition = "decimal(18,3)")
   private double stock;

   //CONSTRUCTORS
   public cProducto() {
   }

   public cProducto(String descripcion, String unid_medida, double costo, double precio, double stock) {
       this.descripcion = descripcion;
       this.unid_medida = unid_medida;
       this.costo = costo;
       this.precio = precio;
       this.stock = stock;
   }

   public cProducto(int id, String descripcion, String unid_medida, double costo, double precio, double stock) {
       this.id = id;
       this.descripcion = descripcion;
       this.unid_medida = unid_medida;
       this.costo = costo;
       this.precio = precio;
       this.stock = stock;
   }

   //get & set

   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getDescripcion() {
       return descripcion;
   }

   public void setDescripcion(String descripcion) {
       this.descripcion = descripcion;
   }

   public String getUnid_medida() {
       return unid_medida;
   }

   public void setUnid_medida(String unid_medida) {
       this.unid_medida = unid_medida;
   }

   public double getCosto() {
       return costo;
   }

   public void setCosto(double costo) {
       this.costo = costo;
   }

   public double getPrecio() {
       return precio;
   }

   public void setPrecio(double precio) {
       this.precio = precio;
   }

   public double getStock() {
       return stock;
   }

   public void setStock(double stock) {
       this.stock = stock;
   }

   


}