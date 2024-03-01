package nationalize;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;
@lombok.Data

public class Nationality {

    private long count;
    private String name;

    @SerializedName("country")
    private List<Country> countries;

    public Nationality(long count, String name, List<Country> countries) {
        this.count = count;
        this.name = name;
        this.countries = countries;
    }

    @lombok.Data
    public static class Country {

        private String countryId;
        private float probability;}}

