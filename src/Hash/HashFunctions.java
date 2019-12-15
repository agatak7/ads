package Hash;

class ETHHash extends HashTable {
    int length;

    public ETHHash(int size) {
        super(size);
        length = size;
    }

    @Override
    public int hash(String item) {
        if(item==null) {return 0;}
        int b = 1;

        for(int i = 0; i < item.length(); i++) {
            b = item.charAt(i) * ((b % 257) + 1 );
        }
        return b % length;

    }
}

class GNUCPPHash extends HashTable {
    int size;
    public GNUCPPHash(int size) {
        super(size);
        this.size = size;
    }

    @Override
    public int hash(String item) {
        if(item == null ) {return 0;}
        int b = 0;
        for(int i = 0; i < item.length(); i++ ) {
            b = 4 * b + item.charAt(i);
        }
        b = b & 2147483647;
        return b % size;
    }
}

class GNUCC1Hash extends HashTable {
    private int size;
    public GNUCC1Hash(int size) {
        super(size);
        this.size = size;
    }

    @Override
    public int hash(String item) {
        if(item == null) return 0;
        int b = item.length();

        for(int i = 0; i<item.length(); i++) {
            b = 613 * b + item.charAt(i);
        }
        b = b & 1073741823;
        return b % size;
    }
}

class HashCodeHash extends HashTable {
    private int size;
    public HashCodeHash(int size) {
        super(size);
        this.size = size;
    }

    @Override
    public int hash(String item) {
        if(item == null) return 0;
        return Math.abs(item.hashCode()) % size;
    }
}

