package com.sam.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sam.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária Tem Desfalque Importante","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit"));
        news.add(new News("Ferrinha Joga No Sabado","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit"));
        news.add(new News("Copa do Mundo Feminina Está Terminando","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit"));


        this.news.setValue(news);
    }

        public LiveData<List<News>> getNews() {
        return this.news;
    }
}