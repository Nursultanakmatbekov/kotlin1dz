package com.example.strim4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class OnePieceRepository {
    private final List<OnePieceModel> listOfCharacters = new ArrayList<>();

    public List<OnePieceModel> getListOfCharacters() {
        
        listOfCharacters.add(new OnePieceModel("https://tl.rulate.ru/i/book/21/5/27160.jpg", "Луффи", 17, "#FF00B6FF"));
        listOfCharacters.add(new OnePieceModel("https://phonoteka.org/uploads/posts/2022-09/1663276672_3-phonoteka-org-p-zoro-art-instagram-4.jpg", "Зорро", 19, "#FF005EFF"));
        listOfCharacters.add(new OnePieceModel("https://i.pinimg.com/originals/0f/c5/3a/0fc53aa839c0de58c7e89a989557cd05.jpg", "Санжи", 21, "#FFFF5722"));
        listOfCharacters.add(new OnePieceModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJlgsk-Ht0ifjT7_69bOXP0f6NiY1ObK_EBjumSRbp_N2QiCtyg_5gG678VNQY7JKBtlE&usqp=CAU", "Усопп", 17, "#FF00B6FF"));
        listOfCharacters.add(new OnePieceModel("https://pm1.narvii.com/6610/08be2542b0c8e668f1cf6203850edb3042c5ed9d_hq.jpg", "Фрэнки", 34, "#FFFFAA00"));
        listOfCharacters.add(new OnePieceModel("https://ip1.anime-pictures.net/previews/1f3/1f384c62128706e308fe899d3782ce80_bp.jpg", "Дзимбей", 44, "#FF005EFF"));
        listOfCharacters.add(new OnePieceModel("https://slovnet.ru/wp-content/uploads/2019/01/3-47.jpg", "Брук", 90, "#FF807637"));
        listOfCharacters.add(new OnePieceModel("https://animego.org/media/cache/thumbs_250x350/upload/character/5a3923c36dbd1.jpg", "Чопер", 17, "#FFF800FF"));
        listOfCharacters.add(new OnePieceModel("https://static.wikia.nocookie.net/onepiece/images/6/68/Nami_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20190924142607&path-prefix=ru", "Нами", 18, "#FF44FF00"));
        listOfCharacters.add(new OnePieceModel("https://i.pinimg.com/736x/b8/9e/ad/b89ead23ae66e210e9f4b17611f43b1a.jpg", "Робин", 20, "#F4D1D1"));
        return listOfCharacters;
    }
}
