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
    "Appstore": {
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
  "name": "Appstore",
  "componentPath": "notnaked/components/appstore",
  "package": "com.notnaked.models",
  "modelName": "Appstore",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "notnaked/components/appstore",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class AppstoreModel extends AbstractComponent {

  public AppstoreModel(Resource r) {
      super(r);
  }

  //GEN[:INJECT
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  @Inject
  private String title;

  /* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
  @Inject
  private String image;

  /* {"type":"string","x-source":"inject","x-form-label":"Play Store URL","x-form-type":"url"} */
  @Inject
  private String playstoreurl;

  /* {"type":"string","x-source":"inject","x-form-label":"Apple Store URL","x-form-type":"url"} */
  @Inject
  private String applestoreurl;

  @Inject
  @Default(values = "internalLink")
  private String imageLinkType;

  @Inject
  private String playStoreImage;

  @Inject
  private String appleStoreImage;

  @Inject
  private String imagealttext;


//GEN]

  //GEN[:GETTERS
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  public String getTitle() {
      return title;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
  public String getImage() {
      return image;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Play Store URL","x-form-type":"url"} */
  public String getPlaystoreurl() {
      return playstoreurl;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Apple Store URL","x-form-type":"url"} */
  public String getApplestoreurl() {
      return applestoreurl;
  }

  public String getImageLinkType() {
      return imageLinkType;
  }

  public String getPlayStoreImage() {
      return playStoreImage;
  }

  public String getAppleStoreImage() {
      return appleStoreImage;
  }

  public String getImagealttext() {
      return imagealttext;
  }

  //GEN]

  //GEN[:CUSTOMGETTERS
  //GEN]

}
