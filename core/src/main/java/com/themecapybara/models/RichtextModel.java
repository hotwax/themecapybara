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
    "Richtext": {
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
  "name": "Richtext",
  "componentPath": "themecapybara/components/richtext",
  "package": "com.themecapybara.models",
  "modelName": "Richtext",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecapybara/components/richtext",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class RichtextModel extends AbstractComponent {

  public RichtextModel(Resource r) {
      super(r);
  }

  //GEN[:INJECT
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  @Inject
  private String title;

  /* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
  @Inject
  private String text;

  //GEN[:GETTERS
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  public String getTitle() {
      return title;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
  public String getText() {
      return text;
  }
}