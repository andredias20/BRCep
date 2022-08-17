public class Localizacao {
    String cep;
    String rua;
    String bairro;
    String municipio;
    String uf;

    public Localizacao(String cep, String rua, String bairro, String municipio, String uf) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.municipio = municipio;
        this.uf = uf;
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

    public String toString() {
        return "Cep: " + getCep()
                + "\nRua: " + getRua()
                + "\nBairro: " + getBairro()
                + "\nMunicipio: " + getMunicipio()
                + "\nUF: " + getUf();
    }
}
