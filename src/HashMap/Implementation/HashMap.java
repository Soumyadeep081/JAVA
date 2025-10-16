package HashMap.Implementation;

import java.util.*;

public class HashMap {
    static class HMnode{
        String key;
        Integer val;
        public HMnode(String key,Integer val){
            this.key=key;
            this.val=val;
        }
        public String toString(){
            return this.key+"@"+this.val;
        }
    }
    private LinkedList<HMnode>[]bucketArray;
    private int size;
    public HashMap(){
        this(5);
    }
    public HashMap(int cap){
        this.bucketArray=new LinkedList[cap];
        this.size=0;

        for(int i=0;i<bucketArray.length;i++){
            bucketArray[i]=new LinkedList<HMnode>();
        }
    }
    public void put(String key,Integer val){
        //key -> hashfunction -> index
        int bi=hashFunction(key);

        //index -> LinkedList
        LinkedList<HMnode>bucket=bucketArray[bi];

        //check if the key already exists in the ll or not
        int fi=findInBucket(bucket,key);
        //if not
        if(fi==-1){
            HMnode nn=new HMnode(key,val);
            this.size++;
            bucket.addLast(nn);
        }
        else{
            //if yes update the value
            HMnode n=bucket.get(fi);
            n.val=val;
        }

        //calculate load factor / threshold
        double threshold=(double) this.size/this.bucketArray.length;
        if(threshold>0.5){
            rehash();
        }
    }
    public int hashFunction(String key){
       int hc=key.hashCode();
       int bi=Math.abs(hc)%bucketArray.length;
       return bi;
    }
    private int findInBucket(LinkedList<HMnode>bucket,String k){
        for(int i=0;i<bucket.size();i++){
            HMnode node=bucket.get(i);
            if(node.key.equals(k))return i;
        }
        return -1;
    }
    private void rehash(){
        LinkedList<HMnode>[]oldBucketArray=this.bucketArray;
        this.bucketArray=new LinkedList[2*oldBucketArray.length];
        this.size=0;
        for (int i=0;i<bucketArray.length;i++){
            bucketArray[i]=new LinkedList<HMnode>();
        }
        for(int i=0;i<oldBucketArray.length;i++){
            LinkedList<HMnode>bucket=oldBucketArray[i];
            for(int j=0;j<bucket.size();j++){
                HMnode node=bucket.get(j);
                put(node.key,node.val);
            }
        }
    }
    public Integer get(String key){
        int bi=hashFunction(key);
        LinkedList<HMnode>bucket=bucketArray[bi];
        int fi=findInBucket(bucket,key);
        if(fi==-1){
            return null;
        }
        else{
            return bucket.get(fi).val;
        }
    }
    public boolean containsKey(String key){
        int bi=hashFunction(key);
        LinkedList<HMnode>bucket=bucketArray[bi];
        int fi=findInBucket(bucket,key);
        return fi!=-1;
    }
    public Integer remove(String key){
        int bi=hashFunction(key);
        LinkedList<HMnode>bucket=bucketArray[bi];
        int fi=findInBucket(bucket,key);
        if(fi==-1)return null;
        else{
            HMnode node=bucket.remove(fi);
            this.size--;
            return node.val;
        }
    }
    public ArrayList<String>keySet(){
        ArrayList<String>keys=new ArrayList<>();
        for(int i=0;i<bucketArray.length;i++){
            LinkedList<HMnode>bucket=bucketArray[i];
            for(int j=0;j<bucket.size();j++){
                HMnode node=bucket.get(j);
                keys.add(node.key);

            }
        }
        return keys;
    }
    public void display(){
        System.out.println("______________________________");
        for(int i=0;i<bucketArray.length;i++){
            LinkedList<HMnode>bucket=bucketArray[i];
            System.out.print("B"+i+"=>");
            for(int j=0;j<bucket.size();j++){
                HMnode node=bucket.get(j);
                System.out.println(node+", ");
            }
            System.out.println(".");
        }
        System.out.println("________________________________");
    }
}
