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
    "Cards": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "showtitle": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Show Card Title",
          "x-form-type": "materialswitch"
        },
        "showtext": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Show Card Text",
          "x-form-type": "materialswitch"
        },
        "showbutton": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Show Card Button",
          "x-form-type": "materialswitch"
        },
        "showcard": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Show Card Background",
          "x-form-type": "materialswitch"
        },
        "customcardcolor": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Custom Card Color",
          "x-form-visible": "model.showcard == 'true'",
          "x-form-type": "materialswitch"
        },
        "cardcolor": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Card Color",
          "x-form-type": "color",
          "x-form-visible": "model.showcard == 'true' and model.customcardcolor == 'true'",
          "x-default": "#ffffff"
        },
        "cardsperrow": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Cards Per Row",
          "x-form-type": "materialrange",
          "x-default": 3,
          "x-form-min": 1,
          "x-form-max": 6
        },
        "cardsperrowtab": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Cards Per Row (Tablet)",
          "x-form-type": "materialrange",
          "x-default": 2,
          "x-form-min": 1,
          "x-form-max": 6
        },
        "cardsperrowmobile": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Cards Per Row (Mobile)",
          "x-form-type": "materialrange",
          "x-default": 1,
          "x-form-min": 1,
          "x-form-max": 6
        },
        "title": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Title",
          "x-form-type": "text"
        },
        "cards": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Cards",
          "x-form-fieldLabel": "title",
          "x-form-type": "collection",
          "properties": {
            "title": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Card Title",
              "x-form-visible": "model.showtitle == 'true'",
              "x-form-type": "text"
            },
            "text": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Card Text",
              "x-form-visible": "model.showtext == 'true'",
              "x-form-type": "texteditor"
            },
            "image": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Card Image",
              "x-form-type": "pathbrowser",
              "x-form-browserRoot": "/content/assets"
            },
            "imagewidth": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Image Width",
              "x-form-type": "materialrange",
              "x-default": "100",
              "x-form-min": "10",
              "x-form-max": "100"
            },
            "imagealttext": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Image Alt Text",
              "x-form-type": "text"
            },
            "buttontext": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Button Text",
              "x-form-visible": "model.showbutton == 'true'",
              "x-form-type": "text"
            },
            "buttonlink": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Button Link",
              "x-form-visible": "model.showbutton == 'true'",
              "x-form-type": "pathbrowser",
              "x-form-browserRoot": "/content/sites"
            },
            "buttoncolor": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Button Color",
              "x-form-type": "materialselect",
              "x-default": "primary",
              "properties": {
                "primary": {
                  "x-form-name": "Primary",
                  "x-form-value": "primary"
                },
                "secondary": {
                  "x-form-name": "Secondary",
                  "x-form-value": "secondary"
                },
                "success": {
                  "x-form-name": "Success",
                  "x-form-value": "success"
                },
                "danger": {
                  "x-form-name": "Danger",
                  "x-form-value": "danger"
                },
                "warning": {
                  "x-form-name": "Warning",
                  "x-form-value": "warning"
                },
                "info": {
                  "x-form-name": "Info",
                  "x-form-value": "info"
                },
                "light": {
                  "x-form-name": "Light",
                  "x-form-value": "light"
                },
                "dark": {
                  "x-form-name": "Dark",
                  "x-form-value": "dark"
                }
              }
            },
            "buttonsize": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Button Size",
              "x-form-type": "materialselect",
              "x-default": "default",
              "properties": {
                "default": {
                  "x-form-name": "Default",
                  "x-form-value": "default"
                },
                "large": {
                  "x-form-name": "Large",
                  "x-form-value": "large"
                },
                "small": {
                  "x-form-name": "Small",
                  "x-form-value": "small"
                }
              }
            }
          }
        }
      }
    }
  },
  "name": "Cards",
  "componentPath": "themecapybara/components/cards",
  "package": "com.themecapybara.models",
  "modelName": "Cards",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecapybara/components/cards",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class CardsModel extends AbstractComponent {

  public CardsModel(Resource r) {
      super(r);
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  @Inject
  private String title;

  /* {"type":"string","x-source":"inject","x-form-label":"Cards","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Card Title","x-form-visible":"model.showtitle == 'true'","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Card Text","x-form-visible":"model.showtext == 'true'","x-form-type":"texteditor"},"image":{"type":"string","x-source":"inject","x-form-label":"Card Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"},"imagewidth":{"type":"string","x-source":"inject","x-form-label":"Image Width","x-form-type":"materialrange","x-default":"100","x-form-min":"10","x-form-max":"100"},"imagealttext":{"type":"string","x-source":"inject","x-form-label":"Image Alt Text","x-form-type":"text"},"buttontext":{"type":"string","x-source":"inject","x-form-label":"Button Text","x-form-visible":"model.showbutton == 'true'","x-form-type":"text"},"buttonlink":{"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-visible":"model.showbutton == 'true'","x-form-type":"pathbrowser","x-form-browserRoot":"/content/sites"},"buttoncolor":{"type":"string","x-source":"inject","x-form-label":"Button Color","x-form-type":"materialselect","x-default":"primary","properties":{"primary":{"x-form-name":"Primary","x-form-value":"primary"},"secondary":{"x-form-name":"Secondary","x-form-value":"secondary"},"success":{"x-form-name":"Success","x-form-value":"success"},"danger":{"x-form-name":"Danger","x-form-value":"danger"},"warning":{"x-form-name":"Warning","x-form-value":"warning"},"info":{"x-form-name":"Info","x-form-value":"info"},"light":{"x-form-name":"Light","x-form-value":"light"},"dark":{"x-form-name":"Dark","x-form-value":"dark"}}},"buttonsize":{"type":"string","x-source":"inject","x-form-label":"Button Size","x-form-type":"materialselect","x-default":"default","properties":{"default":{"x-form-name":"Default","x-form-value":"default"},"large":{"x-form-name":"Large","x-form-value":"large"},"small":{"x-form-name":"Small","x-form-value":"small"}}}}} */
  @Inject
  private List<IComponent> cards;

  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  public String getTitle() {
      return title;
  }

  /* {"type":"string","x-source":"inject","x-form-label":"Cards","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Card Title","x-form-visible":"model.showtitle == 'true'","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Card Text","x-form-visible":"model.showtext == 'true'","x-form-type":"texteditor"},"image":{"type":"string","x-source":"inject","x-form-label":"Card Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"},"imagewidth":{"type":"string","x-source":"inject","x-form-label":"Image Width","x-form-type":"materialrange","x-default":"100","x-form-min":"10","x-form-max":"100"},"imagealttext":{"type":"string","x-source":"inject","x-form-label":"Image Alt Text","x-form-type":"text"},"buttontext":{"type":"string","x-source":"inject","x-form-label":"Button Text","x-form-visible":"model.showbutton == 'true'","x-form-type":"text"},"buttonlink":{"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-visible":"model.showbutton == 'true'","x-form-type":"pathbrowser","x-form-browserRoot":"/content/sites"},"buttoncolor":{"type":"string","x-source":"inject","x-form-label":"Button Color","x-form-type":"materialselect","x-default":"primary","properties":{"primary":{"x-form-name":"Primary","x-form-value":"primary"},"secondary":{"x-form-name":"Secondary","x-form-value":"secondary"},"success":{"x-form-name":"Success","x-form-value":"success"},"danger":{"x-form-name":"Danger","x-form-value":"danger"},"warning":{"x-form-name":"Warning","x-form-value":"warning"},"info":{"x-form-name":"Info","x-form-value":"info"},"light":{"x-form-name":"Light","x-form-value":"light"},"dark":{"x-form-name":"Dark","x-form-value":"dark"}}},"buttonsize":{"type":"string","x-source":"inject","x-form-label":"Button Size","x-form-type":"materialselect","x-default":"default","properties":{"default":{"x-form-name":"Default","x-form-value":"default"},"large":{"x-form-name":"Large","x-form-value":"large"},"small":{"x-form-name":"Small","x-form-value":"small"}}}}} */
  public List<IComponent> getCards() {
      return cards;
  }

}
