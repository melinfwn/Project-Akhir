package com.lawencon.elearning.service;

import java.util.List;

import com.lawencon.elearning.model.Materi;

public interface MateriService {
	abstract Materi insertMateri(Materi materi) throws Exception;
	abstract List<Materi> findByWeekAndDay(int week, int day) throws Exception;
}
