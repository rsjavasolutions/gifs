package com.rsjava.gifs.repository;

import com.rsjava.gifs.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository{

    private static List<Gif> ALL_GIFS = Arrays.asList(
    new Gif("android-explosion","mols",true,1),
    new Gif("ben-and-mike","mika",true,2),
    new Gif("book-dominos","mem",true,0),
    new Gif("compiler-bot","bot",true,1),
    new Gif("cowboy-coder","code",true,1),
    new Gif("infinite-andrew","andrew",true,2)
    );

    public List<Gif> getGifs(){
        return ALL_GIFS;
    }

    public String getGifNames(){
        String result = "";
        for (Gif allGif : ALL_GIFS) {
            result += allGif.getName() + " ";
        }
        return result;
    }
}
