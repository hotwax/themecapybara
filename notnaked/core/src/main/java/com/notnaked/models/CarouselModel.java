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
    "Carousel": {
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
  "name": "Carousel",
  "componentPath": "notnaked/components/carousel",
  "package": "com.notnaked.models",
  "modelName": "Carousel",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "notnaked/components/carousel",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class CarouselModel extends AbstractComponent {

  public CarouselModel(Resource r) {
      super(r);
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Slides","x-form-fieldLabel":"heading","x-form-type":"collection","properties":{"imagepath":{"type":"string","x-source":"inject","x-form-label":"Image Source","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"},"imagefit":{"type":"string","x-source":"inject","x-form-label":"Slide Image Fit","x-form-type":"materialradio","x-default":"cover","properties":{"toggle":{"x-form-name":"Contain","x-form-value":"contain"},"accordion":{"x-form-name":"Cover","x-form-value":"cover"}}},"link":{"type":"string","x-source":"inject","x-form-label":"Link","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"},"title":{"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"},"alt":{"type":"string","x-source":"inject","x-form-label":"Image Alt Text","x-form-type":"text"}}} */
  @Inject
  private List<IComponent> slides;

  /* {"type":"string","x-source":"inject","x-form-label":"Slides","x-form-fieldLabel":"heading","x-form-type":"collection","properties":{"imagepath":{"type":"string","x-source":"inject","x-form-label":"Image Source","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"},"imagefit":{"type":"string","x-source":"inject","x-form-label":"Slide Image Fit","x-form-type":"materialradio","x-default":"cover","properties":{"toggle":{"x-form-name":"Contain","x-form-value":"contain"},"accordion":{"x-form-name":"Cover","x-form-value":"cover"}}},"link":{"type":"string","x-source":"inject","x-form-label":"Link","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"},"title":{"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"},"alt":{"type":"string","x-source":"inject","x-form-label":"Image Alt Text","x-form-type":"text"}}} */
  public List<IComponent> getSlides() {
      return slides;
  }

}
