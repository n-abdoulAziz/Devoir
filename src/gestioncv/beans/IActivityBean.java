package gestioncv.beans;

import java.util.List;

import gestioncv.entities.Activity;

public interface IActivityBean {

	Activity findActivity(Long n);

	List<Activity> findAllActivities();

}
