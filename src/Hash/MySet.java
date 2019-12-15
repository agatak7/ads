package Hash;

import java.util.*;

class MySet extends HashSet<String> {
    private static final long serialVersionUID = 1L;

    public MySet() {
        super();
    }

    /**
     * @return the union of the elements of this and that
     */
    public MySet union(MySet that) {
        MySet result = new MySet();
        Iterator<String> one = this.iterator();

        if(that!=null) {
            Iterator<String> two = that.iterator();

            String uno;
            String dos;

            while(one.hasNext() && two.hasNext()) {
                uno = one.next();
                dos = two.next();
                if(!result.contains(uno)) result.add(uno);
                if(!result.contains(dos)) result.add(dos);
            }

            while(one.hasNext()) {
                uno = one.next();
                if(!result.contains(uno)) result.add(uno);
            }

            while(two.hasNext()) {
                dos = two.next();
                if(!result.contains(dos)) result.add(dos);
            }
        }else {
            while(one.hasNext()) result.add(one.next());
        }

        return result;
    }

    /**
     * @return the intersection of the elements of this and that
     */
    public MySet intersection(MySet that) {
        MySet result = new MySet();

        if(that!=null) {
            Iterator<String> it = this.iterator();
            String x;

            while(it.hasNext()) {
                x = it.next();
                if(that.contains(x)) result.add(x);
            }
        }
        return result;
    }

    /**
     * @return the difference of the elements of this and that
     */
    public MySet difference(MySet that) {
        MySet result = new MySet();

        Iterator<String> it = this.iterator();

        if(that!=null) {

            String x;

            while(it.hasNext()) {
                x = it.next();
                if(!that.contains(x)) result.add(x);
            }

        }else {
            while(it.hasNext()) result.add(it.next());
        }
        return result;
    }

    /**
     * @return the exclusive or (XOR) of the elements of this and that
     */
    public MySet exclusiveOr(MySet that) {
        MySet result = new MySet();
        if(that!=null) {
            MySet one = this.difference(that);
            MySet two = that.difference(this);

            result = one.union(two);
        }else result = this.union(that);

        return result;
    }

    /**
     * @return a String representation of a MySet object
     */
    public String toString() {
        Iterator<String> it = this.iterator();
        String result = "<MySet{";
        while(it.hasNext()) {
            String add = it.next();
            if(it.hasNext()) result+=add+",";
            else result+=add+"}>";

        }
        return result;
    }
}

