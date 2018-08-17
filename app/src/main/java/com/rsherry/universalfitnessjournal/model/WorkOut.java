package com.rsherry.universalfitnessjournal.model;

import com.rsherry.universalfitnessjournal.model.Excercise;
import com.rsherry.universalfitnessjournal.model.MuscleGroup;

import java.util.Date;
import java.util.List;

public class WorkOut {
    Date mWorkoutDate;
    List<ExcerciseSet> mExcerciseSetList;
    List<MuscleGroup.MajorMuscleGroups> mMusclegroupsList;
}
