package pen;

import java.awt.Color;

public class Cartridge {

    public final static int DEFAULT_LEVEL=3;
    private int level;
    private Pen pen = null;
    public final Color COLOR;

    public Cartridge(Color c) {
        this.COLOR = c;
        this.level=DEFAULT_LEVEL;
    }

    public void setPenNull(){
        this.pen = null;
    }

    public void freePen() {
        if (this.pen != null)
        {
            if (this.pen.getCartridge() !=null )
            {
                this.pen.setCartNull();;
            }
            this.pen = null;
        }
    }

    public void setPen(Pen p) {
        if (this.pen != null){
            this.pen.freeCart();
            this.freePen();
        }
        this.pen = p;
        if (p.getCartridge() != this)
        {
            this.pen.changeCartridge(this);
        }
    }

    public void use() {
        if (this.level > 0)
        {this.level --;}
    }

    public boolean isEmpty() {
        return this.level ==0;
    }

    public Pen getPen() {
        return this.pen;
    }

    public int getLevel() {
        return this.level;
    }
}
