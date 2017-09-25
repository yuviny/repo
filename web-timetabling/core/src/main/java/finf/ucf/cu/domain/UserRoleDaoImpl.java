// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package finf.ucf.cu.domain;
/**
 * @see finf.ucf.cu.domain.UserRole
 */
public class UserRoleDaoImpl
    extends finf.ucf.cu.domain.UserRoleDaoBase
{
    /**
     * @see finf.ucf.cu.domain.UserRoleDao#toUserRoleVO(finf.ucf.cu.domain.UserRole, finf.ucf.cu.vo.UserRoleVO)
     */
    public void toUserRoleVO(
        finf.ucf.cu.domain.UserRole source,
        finf.ucf.cu.vo.UserRoleVO target)
    {
        // @todo verify behavior of toUserRoleVO
        super.toUserRoleVO(source, target);
    }


    /**
     * @see finf.ucf.cu.domain.UserRoleDao#toUserRoleVO(finf.ucf.cu.domain.UserRole)
     */
    public finf.ucf.cu.vo.UserRoleVO toUserRoleVO(final finf.ucf.cu.domain.UserRole entity)
    {
        // @todo verify behavior of toUserRoleVO
        return super.toUserRoleVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private finf.ucf.cu.domain.UserRole loadUserRoleFromUserRoleVO(finf.ucf.cu.vo.UserRoleVO userRoleVO)
    {
        // @todo implement loadUserRoleFromUserRoleVO
        throw new java.lang.UnsupportedOperationException("finf.ucf.cu.domain.loadUserRoleFromUserRoleVO(finf.ucf.cu.vo.UserRoleVO) not yet implemented.");

        /* A typical implementation looks like this:
        finf.ucf.cu.domain.UserRole userRole = this.load(userRoleVO.getId());
        if (userRole == null)
        {
            userRole = finf.ucf.cu.domain.UserRole.Factory.newInstance();
        }
        return userRole;
        */
    }

    
    /**
     * @see finf.ucf.cu.domain.UserRoleDao#userRoleVOToEntity(finf.ucf.cu.vo.UserRoleVO)
     */
    public finf.ucf.cu.domain.UserRole userRoleVOToEntity(finf.ucf.cu.vo.UserRoleVO userRoleVO)
    {
        // @todo verify behavior of userRoleVOToEntity
        finf.ucf.cu.domain.UserRole entity = this.loadUserRoleFromUserRoleVO(userRoleVO);
        this.userRoleVOToEntity(userRoleVO, entity, true);
        return entity;
    }


    /**
     * @see finf.ucf.cu.domain.UserRoleDao#userRoleVOToEntity(finf.ucf.cu.vo.UserRoleVO, finf.ucf.cu.domain.UserRole)
     */
    public void userRoleVOToEntity(
        finf.ucf.cu.vo.UserRoleVO source,
        finf.ucf.cu.domain.UserRole target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userRoleVOToEntity
        super.userRoleVOToEntity(source, target, copyIfNull);
    }

}