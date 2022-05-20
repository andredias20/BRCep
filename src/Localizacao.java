public class Localizacao {
    String cep;
    String rua;
    String bairro;
    String municipio;
    String uf;

    public Localizacao(){
    }

    public String getCep() {
        return this.cep;
    }

    public String getRua() {
        return this.rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public String getUf() {
        return this.uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String toString() {
        return "Cep: " + getCep()
                +"\nRua: " + getRua()
                +"\nBairro: " + getBairro()
                +"\nMunicipio: "+getMunicipio()
                +"\nUF: "+getUf();
    }
}
