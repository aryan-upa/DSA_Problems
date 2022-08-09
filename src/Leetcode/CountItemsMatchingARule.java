package Leetcode;

import java.util.List;

public class CountItemsMatchingARule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ruleIndex = -1;

        switch(ruleKey) {
            case "type": ruleIndex = 0;
                break;
            case "color": ruleIndex = 1;
                break;
            case "name": ruleIndex = 2;
                break;
        }

        int len = items.size();
        while(len > 0)
            if(items.get(--len).get(ruleIndex).equals(ruleValue))
                count++;

        return count;
    }

}
