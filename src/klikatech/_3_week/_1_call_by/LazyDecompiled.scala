package klikatech._3_week._1_call_by

object LazyDecompiled {
    lazy val items = Array(1, 2, 3)
}

/*

public final class LazyDecompiled$ {
    public static final LazyDecompiled$ MODULE$;
    private int[] items;
    private volatile boolean bitmap$0;

    static {
        new LazyDecompiled$();
    }

    private int[] items$lzycompute() {
        synchronized (this) {
            if (!this.bitmap$0) {
                this.items = new int[]{1, 2, 3};
                this.bitmap$0 = true;
            }
            final BoxedUnit unit = BoxedUnit.UNIT;
            return this.items;
        }
    }

    public int[] items() {
        return this.bitmap$0 ? this.items : this.items$lzycompute();
    }

    private LazyDecompiled$() {
        MODULE$ = this;
    }
}

*/
