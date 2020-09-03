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
    "Newsletter": {
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
  "name": "Newsletter",
  "componentPath": "themecapybara/components/newsletter",
  "package": "com.themecapybara.models",
  "modelName": "Newsletter",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecapybara/components/newsletter",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class NewsletterModel extends AbstractComponent {

  public NewsletterModel(Resource r) {
      super(r);
  }

  //GEN[:INJECT
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  @Inject
  private String title;

  /* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
  @Inject
  private String text;

  /* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
  @Inject
  private String image;

  /* {"type":"string","x-source":"inject","x-form-label":"Button text","x-form-type":"text"} */
  @Inject
  private String buttontext;

  /* {"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"buttonlinkfield","x-form-browserRoot":"/content/sites"} */
  @Inject
  private String buttonlink;

  @Inject
  @Default(values = "internalLink")
  private String buttonLinkType;

  @Inject
  @Default(values = "internalLink")
  private String imageLinkType;

  @Inject
  private String imagealttext;


//GEN]

  //GEN[:GETTERS
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  public String getTitle() {
      return title;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
  public String getText() {
      return text;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
  public String getImage() {
      return image;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Button text","x-form-type":"text"} */
  public String getButtontext() {
      return buttontext;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"buttonlinkfield","x-form-browserRoot":"/content/sites"} */
  public String getButtonlink() {
      return buttonlink;
  }

  public String getButtonLinkType() {
      return buttonLinkType;
  }

  public String getImageLinkType() {
      return buttonLinkType;
  }

  public String getImagealttext() {
      return imagealttext;
  }

  //GEN]

  //GEN[:CUSTOMGETTERS
  //GEN]

}