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
    "Verticalset": {
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
  "name": "Verticalset",
  "componentPath": "themecapybara/components/verticalset",
  "package": "com.themecapybara.models",
  "modelName": "Verticalset",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecapybara/components/verticalset",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class VerticalsetModel extends AbstractComponent {

  public VerticalsetModel(Resource r) {
      super(r);
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Cards","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Card Title","x-form-type":"text"},"link":{"type":"string","x-source":"inject","x-form-label":"Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"},"image":{"type":"string","x-source":"inject","x-form-label":"Card Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"},"text":{"type":"string","x-source":"inject","x-form-label":"Card Text","x-form-type":"texteditor"},"buttontext":{"type":"string","x-source":"inject","x-form-label":"Button Text","x-form-type":"text"},"buttonlink":{"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-visible":"model.showbutton == 'true'","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"}}} */
  @Inject
  private List<IComponent> cards;

  /* {"type":"string","x-source":"inject","x-form-label":"Cards","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Card Title","x-form-type":"text"},"link":{"type":"string","x-source":"inject","x-form-label":"Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"},"image":{"type":"string","x-source":"inject","x-form-label":"Card Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"},"text":{"type":"string","x-source":"inject","x-form-label":"Card Text","x-form-type":"texteditor"},"buttontext":{"type":"string","x-source":"inject","x-form-label":"Button Text","x-form-type":"text"},"buttonlink":{"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-visible":"model.showbutton == 'true'","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"}}} */
  public List<IComponent> getCards() {
      return cards;
  }

}
