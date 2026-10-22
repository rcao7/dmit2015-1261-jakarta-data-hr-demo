package dmit2015.view;

import dmit2015.model.MapLocation;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;

import java.util.List;

@Named
@RequestScoped
public class MapLocationView {

    @Getter
    private List<MapLocation> locations = List.of(
            new MapLocation("Home Depot Edmonton Skyview",53.5997,-113.5521160),
            new MapLocation("Home Depot Edmonton Westmount",53.56045,-113.573074),
            new MapLocation("Home Depot Edmonton Westend",53.5361,-113.621)
    );
}