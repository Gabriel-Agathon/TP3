package pen;

public class Pen {

    private Cartridge cartridge = null;
    private final Cap CAP;

public Pen() {
    this.CAP = null;
    }
    
    public Pen(String m) {
        this.CAP = new Cap(m);
    }

    public void setCartNull(){
        this.cartridge = null;
    }

    //removes the cartridge
    public void freeCart() {
        if (this.cartridge != null)
        {
            if (this.cartridge.getPen() != null)
            {
                this.cartridge.setPenNull();
            }
            setCartNull();
        }
    }

    public void changeCartridge(Cartridge c) {
        if (this.cartridge != null){
            this.cartridge.freePen();
            this.freeCart();
        }
        this.cartridge = c;
        if (c.getPen() != this)
        {
            this.cartridge.setPen(this);
        }
    }

    public boolean write(String text) {
        if (this.cartridge == null || this.cartridge.isEmpty())
        {return false;}
        else {System.out.println(text);
        this.cartridge.use();
        return true;}
    }

    public Cartridge getCartridge() {
        return this.cartridge;
    }
    
    public String getBrand() {
        return this.CAP.BRAND;
    }

}
