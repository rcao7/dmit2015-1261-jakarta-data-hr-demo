package dmit2015.repository;

import dmit2015.entity.Department;
import dmit2015.entity.Employee;
import dmit2015.entity.Region;
import jakarta.data.Limit;
import jakarta.data.repository.Find;
import jakarta.data.repository.Query;
import jakarta.data.repository.Repository;

import java.util.List;

@Repository
public interface HumanResourcesRepository {

    @Query("""
select d
from Department d
where lower(d.departmentName) like lower(:partialDepartmentName)
order by d.departmentName
""")
    List<Department> departmentsByName(String partialDepartmentName, Limit limit);

    @Find
    Department departmentByDepartmentId(Short id);

    @Query("""
select e
from Employee e join fetch e.department join fetch e.job join fetch e.manager
where e.department.id = :deptId
""")
    List<Employee> employeesByDepartmentId(Short deptId);

    @Find
    List<Region> regions();

}