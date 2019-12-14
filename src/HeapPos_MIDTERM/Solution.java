package HeapPos_MIDTERM;

class Solution {
    /**
     * @param heap
     *     the Heap to check, can be null. If not null, this heap will always contain at least one Node.
     * @return the Node corresponding to the last position in the Heap, or null if the Heap is null.
     */
    public static Heap.Node findLastPosition(Heap heap) {
        if(heap==null){return null;}
        int height = (int)(Math.log(heap.size())/Math.log(2));
        int nodes = 0;
        for(int i = 1; i<=height;i++) {
            nodes += Math.pow(2, height - i);
        }
        int pos = heap.size() - nodes - 1;

        //last node = leaves - 1
        int mask = 1 << (height-1);
        Heap.Node current = heap.getRoot();
        for(int i = 0; i<height; i++) {
            int res = mask & pos;

            if(res==0) {
                //go right;
                current = heap.getLeft(current);
            }else {
                current = heap.getRight(current);
            }
            mask = mask >> 1;

        }

        return current;

    }
}
