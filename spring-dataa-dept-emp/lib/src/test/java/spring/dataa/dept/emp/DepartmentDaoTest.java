package spring.dataa.dept.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.deptemp.entities.Department;
import com.cg.deptemp.repository.DepartmentRepository;

@SpringBootTest
public class DepartmentDaoTest {
@Autowired
DepartmentRepository deptrepo;

@Test
public void testGetDeptById() {
	Department dept = deptrepo.getDeptById(30);
	System.out.println(dept.getDeptno());
	assertEquals(dept.getDeptno(),  30);
}
@Test
public void testGetAllItemsNotNull() {
	List<Department> deptlist = deptrepo.findAll();
	assertNotNull(deptlist);
}
@Test
public void testGetAllItemsNull() {
	List<Department> deptlist = deptrepo.findAll();
	assertNull(deptlist);
}
}
