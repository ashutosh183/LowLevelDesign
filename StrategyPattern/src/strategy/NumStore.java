package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumStore {
    private final List<Integer> nums;
    private final Inserter inserter;
    private final Searcher searcher;

    NumStore(Inserter inserter, Searcher searcher){
        nums = new ArrayList<>();
        this.inserter = inserter;
        this.searcher = searcher;
    }

    public void insert(Integer num){
        this.inserter.insert(num, this.nums);
    }

    public Integer search(Integer key){
        return this.searcher.search(key, this.nums);
    }
}
