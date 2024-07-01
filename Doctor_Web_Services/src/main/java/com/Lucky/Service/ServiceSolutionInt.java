package com.Lucky.Service;

import java.util.List;

import com.Lucky.Model.Solution;

public interface ServiceSolutionInt
{
	public abstract Solution getImageOfSolution(String name);

	public abstract List<Solution> getAllServices();

	public abstract Solution getService(int id);

	public abstract void deleteService(int id);

	public abstract Solution saveService(Solution solution);
}
