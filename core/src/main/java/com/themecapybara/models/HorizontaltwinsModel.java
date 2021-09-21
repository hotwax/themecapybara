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
        resourceType = "themecapybara/components/horizontaltwins",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

public class HorizontaltwinsModel extends AbstractComponent {

    public HorizontaltwinsModel(Resource r) { super(r); }

	@Inject
	private List<IComponent> cards;

	public String getShowbutton() {
		return showbutton;
	}

	public List<IComponent> getCards() {
		return cards;
	}
}
