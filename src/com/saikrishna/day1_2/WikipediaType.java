package com.saikrishna.day1_2;

public class WikipediaType
{
    Wikipedia wikipedia=new Wikipedia("information");
    String WikiType;

    public WikipediaType(String wikiType)
    {
        WikiType = wikiType;
    }

    public void display()
    {
        wikipedia.showWiki();
        System.out.println("Wikipedia Type:"+this.WikiType);
    }
}
