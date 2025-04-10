public class Item {
    private int codigoItem;
    private String descricaoItem;
    private int qtdItem;
    private double precoItem;

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
    public int getCodigoItem() {
        return codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }
}