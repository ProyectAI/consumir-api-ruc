package org.example.Modelo;

import com.google.gson.annotations.SerializedName;

public class Ruc {

    @SerializedName("ruc")
    private long ruc;
    @SerializedName("razonSocial")
    private String razonSocial;
    @SerializedName("estado")
    private String estado;
    @SerializedName("direccion")
    private String direccion;
    @SerializedName("departamento")
    private String departamento;
    @SerializedName("provincia")
    private String provincia;
    @SerializedName("distrito")
    private String distrito;

    public long getRuc() {
        return ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @Override
    public String toString() {
        return "Ruc{" +
                "ruc=" + ruc +
                ", razonSocial='" + razonSocial + '\'' +
                ", estado='" + estado + '\'' +
                ", direccion='" + direccion + '\'' +
                ", departamento='" + departamento + '\'' +
                ", provincia='" + provincia + '\'' +
                ", distrito='" + distrito + '\'' +
                '}';
    }
}
