package net.nortlam.geography.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import org.bson.Document;
import org.bson.types.ObjectId;

public class Country implements Serializable {
    
    public static final String COLLECTION = "country";
    
    public static final String TAG_ID = "_id";
    private ObjectId objectID;

    public static final String TAG_NAME = "name";
    private String name;
    
    public static final String TAG_OFFICIAL = "official";
    private String official;
    
    public static final String TAG_WIKIPEDIA_URL = "url";
    private String wikipediaURL;
    
    public static final String TAG_FLAG_URL = "flag";
    private String flagURL;
    
    public static final String TAG_ORTHOGRAPHIC_PROJECTION_URL = "urlOrthographicProjection";
    private String orthographicProjectionURL;
    
    public static final String TAG_CAPITAL = "capital";
    private String capital;
    
    public static final String TAG_LANGUAGE = "officialLanguage";
    private String language;
    
    public static final String TAG_DEMONYM = "demonym";
    private String demonym;
    
    public static final String TAG_AREA = "area";
    private String area;
    
    public static final String TAG_WATER = "water";
    private String water;
    
    public static final String TAG_POPULATION = "population";
    private String population;
    
    public static final String TAG_CURRENCY = "currency";
    private String currency;
    
    public static final String TAG_CURRENCY_CODE = "currencyCode";
    private String currencyCode;
    
    public static final String TAG_DATE_FORMAT = "dateFormat";
    private String dateFormat;
    
    public static final String TAG_DRIVES_ON_THE = "drivesOnThe";
    private String drivesOnThe;
    
    public static final String TAG_CALLING_CODE = "callingCode";
    private String callingCode;
    
    public static final String TAG_ISO3166 = "ISO3166";
    private String iso3166;
    
    public static final String TAG_INTERNET = "internet";
    private String internet;

    public Country() {
    }
    
    public Country(Document document) {
        this.objectID = document.getObjectId(TAG_ID);
        this.name = document.getString(TAG_NAME);
        this.official = document.getString(TAG_OFFICIAL);
        this.wikipediaURL = document.getString(TAG_WIKIPEDIA_URL);
        this.flagURL = document.getString(TAG_FLAG_URL);
        this.orthographicProjectionURL = document.getString(TAG_ORTHOGRAPHIC_PROJECTION_URL);
        this.capital = document.getString(TAG_CAPITAL);
        this.language = document.getString(TAG_LANGUAGE);
        this.demonym = document.getString(TAG_DEMONYM);
        this.area = document.getString(TAG_AREA);
        this.water = document.getString(TAG_WATER);
        this.population = document.getString(TAG_POPULATION);
        this.currency = document.getString(TAG_CURRENCY);
        this.currencyCode = document.getString(TAG_CURRENCY_CODE);
        this.dateFormat = document.getString(TAG_DATE_FORMAT);
        this.drivesOnThe = document.getString(TAG_DRIVES_ON_THE);
        this.callingCode = document.getString(TAG_CALLING_CODE);
        this.iso3166 = document.getString(TAG_ISO3166);
        this.internet = document.getString(TAG_INTERNET);
    }

    public ObjectId getObjectID() {
        return objectID;
    }

    public void setObjectID(ObjectId objectID) {
        this.objectID = objectID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getWikipediaURL() {
        return wikipediaURL;
    }

    public void setWikipediaURL(String wikipediaURL) {
        this.wikipediaURL = wikipediaURL;
    }

    public String getFlagURL() {
        return flagURL;
    }

    public void setFlagURL(String flagURL) {
        this.flagURL = flagURL;
    }

    public String getOrthographicProjectionURL() {
        return orthographicProjectionURL;
    }

    public void setOrthographicProjectionURL(String orthographicProjectionURL) {
        this.orthographicProjectionURL = orthographicProjectionURL;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDrivesOnThe() {
        return drivesOnThe;
    }

    public void setDrivesOnThe(String drivesOnThe) {
        this.drivesOnThe = drivesOnThe;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public String getIso3166() {
        return iso3166;
    }

    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.objectID);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.official);
        hash = 67 * hash + Objects.hashCode(this.wikipediaURL);
        hash = 67 * hash + Objects.hashCode(this.flagURL);
        hash = 67 * hash + Objects.hashCode(this.orthographicProjectionURL);
        hash = 67 * hash + Objects.hashCode(this.capital);
        hash = 67 * hash + Objects.hashCode(this.language);
        hash = 67 * hash + Objects.hashCode(this.demonym);
        hash = 67 * hash + Objects.hashCode(this.area);
        hash = 67 * hash + Objects.hashCode(this.water);
        hash = 67 * hash + Objects.hashCode(this.population);
        hash = 67 * hash + Objects.hashCode(this.currency);
        hash = 67 * hash + Objects.hashCode(this.currencyCode);
        hash = 67 * hash + Objects.hashCode(this.dateFormat);
        hash = 67 * hash + Objects.hashCode(this.drivesOnThe);
        hash = 67 * hash + Objects.hashCode(this.callingCode);
        hash = 67 * hash + Objects.hashCode(this.iso3166);
        hash = 67 * hash + Objects.hashCode(this.internet);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.official, other.official)) {
            return false;
        }
        if (!Objects.equals(this.wikipediaURL, other.wikipediaURL)) {
            return false;
        }
        if (!Objects.equals(this.flagURL, other.flagURL)) {
            return false;
        }
        if (!Objects.equals(this.orthographicProjectionURL, other.orthographicProjectionURL)) {
            return false;
        }
        if (!Objects.equals(this.capital, other.capital)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.demonym, other.demonym)) {
            return false;
        }
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        if (!Objects.equals(this.water, other.water)) {
            return false;
        }
        if (!Objects.equals(this.population, other.population)) {
            return false;
        }
        if (!Objects.equals(this.currency, other.currency)) {
            return false;
        }
        if (!Objects.equals(this.currencyCode, other.currencyCode)) {
            return false;
        }
        if (!Objects.equals(this.dateFormat, other.dateFormat)) {
            return false;
        }
        if (!Objects.equals(this.drivesOnThe, other.drivesOnThe)) {
            return false;
        }
        if (!Objects.equals(this.callingCode, other.callingCode)) {
            return false;
        }
        if (!Objects.equals(this.iso3166, other.iso3166)) {
            return false;
        }
        if (!Objects.equals(this.internet, other.internet)) {
            return false;
        }
        if (!Objects.equals(this.objectID, other.objectID)) {
            return false;
        }
        return true;
    }
    
    public JsonObject toJson() {
        return toJson(null);
    }
    
    public JsonObject toJson(Collection<String> fields) {
        boolean selectFields = (fields != null && !fields.isEmpty());
        
        JsonObjectBuilder builder = Json.createObjectBuilder();
        
        if(selectFields) {
            if(this.objectID != null && fields.contains(TAG_ID)) 
                builder.add(TAG_ID, this.objectID.toHexString());
            if(this.name != null && fields.contains(TAG_NAME)) 
                builder.add(TAG_NAME, this.name);
            if(this.official != null && fields.contains(TAG_OFFICIAL)) 
                builder.add(TAG_OFFICIAL, this.official);
            if(this.wikipediaURL != null && fields.contains(TAG_WIKIPEDIA_URL)) 
                builder.add(TAG_WIKIPEDIA_URL, this.wikipediaURL);
            if(this.flagURL != null && fields.contains(TAG_FLAG_URL)) 
                builder.add(TAG_FLAG_URL, this.flagURL);
            if(this.orthographicProjectionURL != null && fields.contains(TAG_ORTHOGRAPHIC_PROJECTION_URL)) 
                builder.add(TAG_ORTHOGRAPHIC_PROJECTION_URL, this.orthographicProjectionURL);
            if(this.capital != null && fields.contains(TAG_CAPITAL)) 
                builder.add(TAG_CAPITAL, this.capital);
            if(this.language != null && fields.contains(TAG_LANGUAGE)) 
                builder.add(TAG_LANGUAGE, this.language);
            if(this.demonym != null && fields.contains(TAG_DEMONYM)) 
                builder.add(TAG_DEMONYM, this.demonym);
            if(this.area != null && fields.contains(TAG_AREA)) 
                builder.add(TAG_AREA, this.area);
            if(this.water != null && fields.contains(TAG_WATER)) 
                builder.add(TAG_WATER, this.water);
            if(this.population != null && fields.contains(TAG_POPULATION)) 
                builder.add(TAG_POPULATION, this.population);
            if(this.currency != null && fields.contains(TAG_CURRENCY)) 
                builder.add(TAG_CURRENCY, this.currency);
            if(this.currencyCode != null && fields.contains(TAG_CURRENCY_CODE)) 
                builder.add(TAG_CURRENCY_CODE, this.currencyCode);
            if(this.dateFormat != null && fields.contains(TAG_DATE_FORMAT)) 
                builder.add(TAG_DATE_FORMAT, this.dateFormat);
            if(this.drivesOnThe != null && fields.contains(TAG_DRIVES_ON_THE)) 
                builder.add(TAG_DRIVES_ON_THE, this.drivesOnThe);
            if(this.callingCode != null && fields.contains(TAG_CALLING_CODE)) 
                builder.add(TAG_CALLING_CODE, this.callingCode);
            if(this.iso3166 != null && fields.contains(TAG_ISO3166)) 
                builder.add(TAG_ISO3166, this.iso3166);
            if(this.internet != null && fields.contains(TAG_INTERNET)) 
                builder.add(TAG_INTERNET, this.internet);
        } else {
            if(this.objectID != null) builder.add(TAG_ID, this.objectID.toHexString());
            if(this.name != null) builder.add(TAG_NAME, this.name);
            if(this.official != null) builder.add(TAG_OFFICIAL, this.official);
            if(this.wikipediaURL != null) builder.add(TAG_WIKIPEDIA_URL, this.wikipediaURL);
            if(this.flagURL != null) builder.add(TAG_FLAG_URL, this.flagURL);
            if(this.orthographicProjectionURL != null) 
                builder.add(TAG_ORTHOGRAPHIC_PROJECTION_URL, this.orthographicProjectionURL);
            if(this.capital != null) builder.add(TAG_CAPITAL, this.capital);
            if(this.language != null) builder.add(TAG_LANGUAGE, this.language);
            if(this.demonym != null) builder.add(TAG_DEMONYM, this.demonym);
            if(this.area != null) builder.add(TAG_AREA, this.area);
            if(this.water != null) builder.add(TAG_WATER, this.water);
            if(this.population != null) builder.add(TAG_POPULATION, this.population);
            if(this.currency != null) builder.add(TAG_CURRENCY, this.currency);
            if(this.currencyCode != null) builder.add(TAG_CURRENCY_CODE, this.currencyCode);
            if(this.dateFormat != null) builder.add(TAG_DATE_FORMAT, this.dateFormat);
            if(this.drivesOnThe != null) builder.add(TAG_DRIVES_ON_THE, this.drivesOnThe);
            if(this.callingCode != null) builder.add(TAG_CALLING_CODE, this.callingCode);
            if(this.iso3166 != null) builder.add(TAG_ISO3166, this.iso3166);
            if(this.internet != null) builder.add(TAG_INTERNET, this.internet);
        }
        
        return builder.build();
    }
}
