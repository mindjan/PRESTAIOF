package models;

import models.IOF.FullStocks.Images.Images;
import models.IOF.FullStocks.LongDescription;
import models.IOF.FullStocks.Parameters.Parameter;
import models.IOF.FullStocks.Parameters.Parameters;
import models.IOF.FullStocks.Price;

import java.net.URL;
import java.util.List;

/**
 * Created by Mindaugas on 6/5/2016.
 */
public class FullStocks {
    private Long id;
    private String name;
    private Integer unitId;
    private URL cardUrl;
    private List<LongDescription> longDescription;
    private Price price;
    private Images images;
    private Parameters parameters;


}
