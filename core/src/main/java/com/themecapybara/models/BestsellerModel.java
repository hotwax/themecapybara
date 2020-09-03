package com.themecapybara.models;

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
    "Bestseller": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "text": {
          "type": "string",
          "x-source": "inject",
          "x-form-type": "texteditor"
        }
      }
    }
  },
  "name": "Bestseller",
  "componentPath": "themecapybara/components/bestseller",
  "package": "com.themecapybara.models",
  "modelName": "Bestseller",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecapybara/components/bestseller",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class BestsellerModel extends AbstractComponent {

  public BestsellerModel(Resource r) { super(r); }

  //GEN[:INJECT
    /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
@Inject
private String title;

/* {"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"text"} */
@Inject
private String url;


//GEN]

  //GEN[:GETTERS
    /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
public String getTitle() {
  return title;
}

/* {"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"text"} */
public String getUrl() {
  return url;
}


//GEN]

  //GEN[:CUSTOMGETTERS
  //GEN]

}
