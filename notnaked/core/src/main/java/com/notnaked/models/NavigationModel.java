package com.notnaked.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import com.peregrine.nodetypes.models.Container;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Navigation": {
      "type": "object",
      "x-type": "container",
      "properties": {}
    }
  },
  "name": "Navigation",
  "componentPath": "notnaked/components/navigation",
  "package": "com.notnaked.models",
  "modelName": "Navigation",
  "classNameParent": "Container"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "notnaked/components/navigation",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class NavigationModel extends Container {

    public NavigationModel(Resource r) { super(r); }

    @Inject
    private String title;

    /* {"type":"string","x-source":"inject","x-form-label":"link","x-form-type":"pathbrowser","x-form-browserRoot":"/context/sites"} */
    @Inject
    private String link;

    @Inject
    private String linkType;


//GEN]

    //GEN[:GETTERS
    /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
    public String getTitle() {
        return title;
    }

    /* {"type":"string","x-source":"inject","x-form-label":"link","x-form-type":"pathbrowser","x-form-browserRoot":"/context/sites"} */
    public String getLink() {
        return link;
    }

    public String getLinkType() {
        return linkType;
    }


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
