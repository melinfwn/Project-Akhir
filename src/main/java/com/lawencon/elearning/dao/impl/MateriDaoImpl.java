package com.lawencon.elearning.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.elearning.dao.MateriDao;
import com.lawencon.elearning.model.Materi;

@Repository("materi_repo_hibernate")
public class MateriDaoImpl extends BaseHibernate implements MateriDao {

	@Override
	public Materi insertMateri(Materi materi) throws Exception {
		em.persist(materi);
		return materi;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Materi> findByWeekAndDay(int week, int day) throws Exception {
		Query q = em.createNativeQuery("select filemateri from tb_materi where week = :week and day = :day")
				.setParameter("week", week).setParameter("day", day);
		return q.getResultList();
	}

}
