package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Allergies")
public class Allergies extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6529981379283709235L;
}
