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

@Model(
        adaptables = Resource.class,
        resourceType = "themecapybara/components/shopbystore",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

public class ShopbystoreModel extends AbstractComponent {

  public ShopbystoreModel(Resource r) {
      super(r);
  }

  @Inject
  private String title;

  @Inject
  private String url;

  public String getTitle() {
      return title;
  }

  public String getUrl() {
      return url;
  }
}
