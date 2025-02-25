package entidades;

import java.util.UUID;

public class Productos {
    UUID uuid = UUID.randomUUID();
    String referencia;
    byte unidades;
    String fechaCreacion;
    String fechaModificacion;


    public Productos(UUID uuid, String referencia, byte unidades, String fechaCreacion, String fechaModificacion) {
        this.uuid = uuid;
        this.referencia = referencia;
        this.unidades = unidades;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Productos(String referencia, byte unidades, String fechaCreacion) {
        this.referencia = referencia;
        this.unidades = unidades;
        this.fechaCreacion = fechaCreacion;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public byte getUnidades() {
        return unidades;
    }

    public void setUnidades(byte unidades) {
        this.unidades = unidades;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
